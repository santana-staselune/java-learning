package lv.acodemy;

    public class Cars {
        //fuel (0-100)
        //mileage (mileage in k/m)
        //wear (0-100)
        //model name

        //create all argument constructor
        //default fuel - 50,


        private int fuel;
        private int mileage;
        private int wear;
        private String modelName;

     /*   public Cars(int fuel, int mileage, int wear, String modelName) {
            this.fuel = fuel;
            this.mileage = mileage;
            this.wear = wear;
            this.modelName = modelName;
        }

        @Override
        public String toString() {
            return "Cars{" +
                    "fuel=" + fuel +
                    ", mileage=" + mileage +
                    ", wear=" + wear +
                    ", modelName='" + modelName + '\'' +
                    '}';
        }*/

        public Cars(String modelName) {
            this.modelName = modelName;
            this.fuel = 50;
            this.mileage = 0;
            this.wear = 0;
        }
        void drive(){
            //if fuel >=10 && wear <90

            //fuel "-10"
            //mileage +50
            // wear +10

            //else if fuel <10 will print not enough fuel

            //else -> car is very used!

            if (fuel >=10 && wear < 90) {
                fuel = fuel - 10;
                mileage = mileage + 50;
                wear = wear + 10;
            } else if (fuel < 10 ) {
                System.out.println("Not enough fuel");
            } else {
                System.out.println("Car is very used!");
            }
        }

        @Override
        public String toString() {
            return "Cars{" +
                    "fuel=" + fuel +
                    ", mileage=" + mileage +
                    ", wear=" + wear +
                    ", modelName='" + modelName + '\'' +
                    '}';
        }

        //new method refuel()->
        //if
        public void refuel() {
            if(fuel < 100) {
                fuel = fuel + 30;
                if(fuel > 100) fuel = 100;
                System.out.println(modelName + " is refueled");
            } else {
                System.out.println("Tank is full");
            }
        }

        // service decrease wear on 30;
        //if wear >0. wear = wear -30;
        //if wear <0 wear = 0 print model + "is fixed"
        //else -> print "In a good condition"

        public void service() {
            if(wear > 0) {
                wear = wear - 30;}
                if (wear < 0) {wear = 0;
                System.out.println(modelName + " is fixed");
            } else {
                System.out.println("In a good condition");
            }
        }
        void showStatus(){
            System.out.println("Fuel:" + fuel);
            System.out.println("Wear:" + wear);
            System.out.println("Mileage:" + mileage);
        }


        }
    }
