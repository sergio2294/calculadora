
public class MCM {
private int num1;
private int num2;
public MCM() {
	this.num1=num1;
	this.num2=num2;
}public static int mcd(int num3, int num4) {
        int mcd = 0;
        num1= Math.max(num3, num4);
        num2 = Math.min(num3, num4);
        do {
            mcd = num2;
            num2 = num1%num2;
            num1 = mcd;
        } while(b!=0);
        return mcd;
    }
 
public static int mcm(int num3,int num4) {
	int mcm=0;
	num1=Math.max(num3,num4);
	num2=Math.min(num3,num4);
	mcm=(num1/mcd(num1,num2))*num2;
	return mcm;
}

}
