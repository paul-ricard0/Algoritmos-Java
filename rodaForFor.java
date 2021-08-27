public class rodaForFor {

    public static void main(String[] args) {

        int x=3, y =2;
 		for(int i=0;i<=2;++i){
  			for(int j=0;j<=2;++j){
  				y+=x;
  				x++;
  		    }
  	    }
       	System.out.println(x);
       	System.out.println(y);

     }
}