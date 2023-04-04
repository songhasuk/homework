package TEST;


public class Box1 {
	
	int width, height, length, volume;
	private int add;
	
	public Box1(int w, int h, int l) {
		this.width = w;
		this.height = h;
		this.length = l;
		volume = w*h*l;
	}
	Box1 whosLargest(Box1 box1, Box1 box2) {
		 if(box1.volume > box2.volume) {
			 return box1;
		 }else {
			 return box2;
		 }
	}
	public void setAdd(int width) {
		 if(width==10) {
			 return;
		 }else {
			 this.width=width;
		 }
		 System.out.println("width");
	}
	public int array(int ... valuse) {
		int sum =0;
		for(int i =0; i < valuse.length; i++) {
			sum+=valuse[i];
		}
		return sum;
	}
	


}
