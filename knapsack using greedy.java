import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter the no of objects");
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("enter the size of knapsack");
    	int C=sc.nextInt();
    	int profit[]=new int[N];
    	int weights[]=new int[N];
    	double p_w_[]=new double[N];
    	double x[]=new double[N];
    	System.out.println("enter the profit of objects");
    	for(int i=0;i<N;i++){
    	    profit[i]=sc.nextInt();
    	}
    	System.out.println("enter the weights of objects");
    	for(int i=0;i<N;i++){
    	    weights[i]=sc.nextInt();
    	}
    	System.out.println("enter the p_w_ratio of objects");
    	for(int i=0;i<N;i++){
    	    p_w_[i]=(double)(profit[i])/(double)(weights[i]);
    	}
        for(int i=0;i<N;i++){
    	 System.out.println(p_w_[i]);   ;	
        }
	    for(int i=0;i<p_w_.length-1;i++){
	       for (int j=0;j<p_w_.length-1;j++){
	          if (p_w_[j]<p_w_[j+1]){
	          double temp=p_w_[j];
	          p_w_[j]=p_w_[j+1];
	          p_w_[j+1]=temp;
	          
	          int temp1=weights[j];
	          weights[j]=weights[j+1];
	          weights[j+1]=temp1;
	          
	          int temp2=profit[j];
	          profit[j]=profit[j+1];
	          profit[j+1]=temp2;
	    }
	}
	    }
	    for(int i=0;i<N;i++){
	        System.out.println("ordered p_w_[i]");
	        System.out.println(p_w_[i]);
	    }
	    for(int i=0;i<N;i++){
	    x[i]=0;
	    }
	    int U=C;
	    for(int i=0;i<N;i++){
	        if(weights[i]<U){
	            x[i]=1.0;
	        }
	        else{
	            if(U<=0){
	                break;
	                
	            }
	            x[i]=(double)(U)/(double)(weights[i]);
	        }
	        U=U-weights[i];
	    }
	    for(int i=0;i<N;i++){
	        System.out.println("x[i] profits");
	        System.out.println(x[i]);
	    }
                double y=0;
	    System.out.println("max profits ");
	    for (int i=0;i<N;i++){
	    y=y+profit[i]*x[i];
	    }
	    System.out.println(y);
	}  
}
