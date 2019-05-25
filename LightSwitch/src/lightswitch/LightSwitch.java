/*
 This is a simple program that will allow you to turn a light switch on and off
 */
package lightswitch;

/**
 *
 * @author samanthafields
 */
public class LightSwitch {
    boolean lightSwitch;
    
    public static void main(String[] args) {
        
        LightSwitch light = new LightSwitch();
        light.setLightSwitch(false);
        light.getLightSwitch();
        light.flipLightSwitch();
        light.flipLightSwitch();
        light.flipLightSwitch();
        
    }
    
    public void flipLightSwitch(){ // allows user to flip the light switch on and off
        if(lightSwitch == true){
            System.out.println("You switched the light Off");
            lightSwitch = false; 
        }
        else{
            System.out.println("You switched the light on");
            lightSwitch = true;
        }
    }
    
    public void setLightSwitch(boolean status){ // sets the light switch to either be on or off
        lightSwitch = status;
        if(status == true){
            lightSwitch = status;
            System.out.println("Light is on");
        }
        else{
            
            System.out.println("Light is off");
        }
    }
    
    public boolean getLightSwitch(){
        return lightSwitch;
    }
       
}
