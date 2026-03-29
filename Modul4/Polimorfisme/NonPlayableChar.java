class NonPlayableChar extends Character {

    private Character karakterAsli;

    public NonPlayableChar(Character ch) {
        this.karakterAsli = ch;
        this.name = ch.name;
    }

    @Override
    public void doWork() {
        karakterAsli.doWork();
    }

    @Override
    public void kill(Character ch) {
        karakterAsli.kill(ch);
    }
}