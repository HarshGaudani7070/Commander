public class arraycal{

    public static void main(String[] args) {
    
    int r,i,j;

    int a[] = {6,7,8,9,10};
    int b[] = {10,9,8,7,6};

    int total[] = new int[20];

    
    for(i=0; i<a.length; i++){
        
        total[i] = a[i]+b[i]; 
    }

    for(i=0; i<a.length; i++){
        System.out.println("Addition = "+ total[i]);

    }
    
    
    
    
    
    
    
    
    
    
    }
}