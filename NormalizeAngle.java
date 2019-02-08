 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        Integer newAngle = angle % 360;
        if (newAngle > 0) {
            return newAngle;
        } else {
            newAngle += 360;
            return newAngle;
        }
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        Integer angle = Math.floorMod(integer,360);
        if (integer < 0) {
            angle = 360 - angle;
        }
        return angle;
    }

    public static void main(String[] args){

    }
}
