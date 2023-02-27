package weekly.Assignment2;

public class Mobile {
	public void mobileON() {
        System.out.println("Switch on the mobile");
    }
    public void data() {
        System.out.println("Sync data");
    }
    public void call(){
        System.out.println("Call");
    }

    public void message(){
        System.out.println("Send Message");
    }
   public void camera(){
        System.out.println("Take pictures and videos");
    }
   public void openDocument() {
		 System.out.println("OpenDocument");
	 }
   public void shareDocument() {
		 System.out.println("ShareDocument");
	 }
   public void mobileOFF() {
       System.out.println("Unlock mobile");
   }
   public static void main(String[] args) {
		Mobile MiMobile=new Mobile();
		MiMobile.mobileON();
		MiMobile.data();
		MiMobile.call();
		MiMobile.message();
		MiMobile.camera();
		MiMobile.openDocument();
		MiMobile.shareDocument();
		MiMobile.mobileOFF();
		
   }
		
  
}
