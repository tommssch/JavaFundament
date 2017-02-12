package Task6;


import Task7.Atom;

@Atom(name="ATOM")
class AtomicBoat {

private EngineofBoat engine;
private byte num_weap;
private int num_crew;



AtomicBoat(int ncrew, byte power, byte weaps){

        if(weaps<0&&ncrew<0)
        {
            num_weap=0;
            num_crew=0;
        }
        else
        {
            num_weap=weaps;
            num_crew=ncrew;

        }
        engine=new EngineofBoat(power);
    }

void runBoat(){
    if(engine.isStarted()) {
        System.out.printf("Engine started,number of crew:%d ,number of weapons:%d \n"
                , num_crew,num_weap);
        System.out.println("Boat is ready to sail");
        System.out.println("START!");
    }
    else
        System.out.println("Engine not started");

}
    class EngineofBoat{
        private boolean start;
        private byte power;

        EngineofBoat(byte pow){

            if(power<0)
                power=0;
            else
                power=pow;

            startEngine();
        }

        void startEngine(){
            start = power >= 80;
        }


        public void stopEngine(){
            start=false;
        }
        boolean isStarted(){
            return start;
        }
    }
}
