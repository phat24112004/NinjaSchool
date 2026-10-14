public final class att extends a
{
    private fq task;
    public int targetZone;
    public int retryGetTask;
    public long lastTime;
    public int checkMobCount;
    public long lastZoneCheck;
    private int danhCumState;
    
    public att() {
        super();
        this.targetZone = 0;
    }
    
    public final void a() {
        this.task = aa.m(1);
        this.initZone();
        super.a();
    }
    
    @Override
    public final void b() {
        super.b();
        this.task = aa.m(1);
        this.initZone();
    }
    
    private void initZone() {
        this.targetZone = ((fr.g % 5 == 0) ? fr.g : 0);
    }
    
    private void checkAutoPotion() {
        try {
            if (aa.z().o < aa.z().by * aa.be / 100) {
                aa.z().b(17);
            }
            if (aa.z().dk < aa.z().ct * aa.gh / 100) {
                aa.z().b(16);
            }
        }
        catch (final Exception ex) {}
    }
    
    private boolean hasLiveTaThu() {
        try {
            for (int i = 0; i < ee.ed.size(); ++i) {
                final ev mob = (ev)ee.ed.elementAt(i);
                if (mob.ac != 0 && mob.l == 3) {
                    return true;
                }
            }
        }
        catch (final Exception ex) {}
        return false;
    }
    
    public final void e() {
        final Object att2 = this;
        if (h()) {
            ee.b("Nh\u00e2n v\u1eadt ki\u1ec7t s\u1ee9c -> H\u1ed3i sinh/V\u1ec1 l\u00e0ng");
            a.a(true);
            return;
        }
        this.checkAutoPotion();
        if (this.danhCumState == 0) {
            this.danhCumState = (InputNpc.danhCum ? 2 : 1);
            InputNpc.danhCum = false;
        }
        this.task = aa.m(1);
        if (this.task == null) {
            if (System.currentTimeMillis() - this.lastTime > 20000L) {
                this.retryGetTask = 0;
                this.lastTime = System.currentTimeMillis();
            }
            ee.b("\u0110ang \u0111i nh\u1eadn T\u00e0 Th\u00fa (L\u1ea7n " + (dp.tatuCount + 1) + ")...");
            if (fr.s != 1) {
                this.a(1, 0, -1, -1);
                return;
            }
            ee.a(25, InputNpc.indexNpcTT, 0);
            this.task = aa.m(1);
            if (this.task == null) {
                ++this.retryGetTask;
                if (this.retryGetTask > 20) {
                    ee.b("Kh\u00f4ng nh\u1eadn \u0111\u01b0\u1ee3c NV (H\u1ebft l\u01b0\u1ee3t) -> Chuy\u1ec3n Auto!");
                    InputNpc.danhCum = (this.danhCumState == 2);
                    this.danhCumState = 0;
                    dp.tatuCount = 4;
                    this.retryGetTask = 0;
                    cv.d();
                }
                return;
            }
        }
        this.retryGetTask = 0;
        if (this.task.e >= this.task.d) {
            ee.b("\u0110\u00e3 xong T\u00e0 Th\u00fa -> V\u1ec1 Map 1 tr\u1ea3 NV");
            if (fr.s != 1) {
                this.a(1, 0, -1, -1);
                return;
            }
            ee.a(25, InputNpc.indexNpcTT, 2);
            this.task = null;
            this.initZone();
            ++dp.tatuCount;
            ee.b("Ho\u00e0n th\u00e0nh NV T\u00e0 Th\u00fa " + dp.tatuCount + "! Chu\u1ea9n b\u1ecb nh\u1eadn ti\u1ebfp...");
        }
        else {
            final int n = this.task.f;
            final int n2 = this.task.g;
            if (fr.s != n) {
                this.initZone();
                ee.b("Di chuy\u1ec3n t\u1edbi Map " + n + " (Khu " + this.targetZone + ")");
                this.a(n, this.targetZone, -1, -1);
                return;
            }
            if (!this.hasLiveTaThu()) {
                this.targetZone = (this.targetZone + 5) % 30;
                ee.b("Kh\u00f4ng c\u00f2n T\u00e0 Th\u00fa s\u1ed1ng -> Chuy\u1ec3n Khu " + this.targetZone);
                this.a(n, this.targetZone, -1, -1);
                return;
            }
            if (cr.f(cr.b(aa.m(1)) ? 1 : 0)) {
                this.targetZone = fr.g;
                this.a(n2, 8);
                return;
            }
            if (fr.g != this.targetZone) {
                ee.b("\u0110ang di chuy\u1ec3n v\u00e0o Khu " + this.targetZone + "...");
                this.a(n, this.targetZone, -1, -1);
                return;
            }
            this.a(n, this.targetZone = (this.targetZone + 5) % 30, -1, -1);
        }
    }
    
    @Override
    public final String toString() {
        return "Auto T\u00e0 Th\u00fa Custom";
    }
}
