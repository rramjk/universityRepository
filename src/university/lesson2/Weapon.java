package university.lesson2;

abstract class Weapon {
    private int bullets = 5;
    private final int MAX_BULLETS;

    Weapon(int bullets, int maxBullets) {
        if (bullets > 0 && maxBullets > 0) {
            if (maxBullets > bullets) {
                this.bullets = bullets;
            } else {
                this.bullets = maxBullets;
            }
            MAX_BULLETS = maxBullets;
        } else {
            throw new IllegalArgumentException("Патроны и макс кол-во патронов не могут быть меньше нуля!");
        }
    }
    public void diffuse(){
        bullets = 0;
    }
    public boolean isLoaded(){
        return bullets > 0;
    }

    public int getBullets() {
        return bullets;
    }
    public void reload(int bullets){
        if(bullets < 0){
            throw new IllegalArgumentException("Кол-во патронов не может быть меньше нуля!");
        }else{
            if(bullets > MAX_BULLETS){
                this.bullets = MAX_BULLETS;
            }else{
                this.bullets = bullets;
            }
        }
    }
    abstract void fire();
}
