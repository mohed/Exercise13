package com.AcademicWork;

/**
 * Created by Administrator on 2016-08-16.
 */
public class Car {

        private Tire[] wheels;
        private Door[] doors;
        private float weight;

        public Car(float weight, Tire[] wheels, Door[] doors) {
            this.weight = weight;
            this.wheels = wheels;
            this.doors = doors;
        }

        public float GetWeight() {
            //Implement logic here to get the total weight of //the car + all the doors and wheels return;
            float totalWeight = 0;

            for(int i = 0; i < wheels.length; i++) {
                totalWeight += wheels[i].getWeight();
                totalWeight += doors[i].getWeight();
            }

            totalWeight += weight;
            return totalWeight;
        }

}

