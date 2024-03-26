class ParkingSystem {
int big;
int medium;
int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1 && big>=1){
               big=big-1;
               return true;
        }
        if(carType==2 && medium>=1){
               medium=medium-1;
               return true;
        }
        if(carType==3 && small>=1){
               small=small-1;
               return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
//LEETCODE
