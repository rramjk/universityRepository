package university.lesson2;

public class Pistol extends Weapon{

    Pistol(int bullets, int maxBullets){
        super(bullets, maxBullets);
    }
    public void fire(){
        if(getBullets() != 0){
            System.out.println("Бах!");
            reload(getBullets()-1);
        }else{
            System.out.println("Клац!");
        }
    }

}
