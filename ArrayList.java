//Assignment
class ArrayList
{
	int [] data;
	int arrayLength;
	
	ArrayList (int size){
		data = new int [size];
		arrayLength=size;
	}
	void reset(int element){
		for(int i=0; i<data.length; i++){
			data[i]=0;
		}
	}
	void print(){
		for(int i=0; i<data.length ; i++){
			System.out.print(data[i]+",");
		}
		System.out.println();
	}
	void replaceAt(int element, int index){
		if(index < 0 || index > arrayLength){
			System.out.println("invalid index");
		}
    	else{
			data[index]=element;
		}
	}
	void getElementAt(int index){
		if(index < 0 || index > arrayLength){
			System.out.println("Invalid Index");
		}
		else{
			data[index] = 0;
		}
	}
	int isContain(int element){
		int x=0;
		for(int i=0; i<data.length; i++){
			if(data[i]==element)
			{
				x=1;
				break;
			}
		}
		return x;
	}
     void swap(int i , int j){
		if(i<0 || j<0 || i>arrayLength || j>arrayLength){
            System.out.print("Invalid index");
        }
        else {
            int num1 = data[i];
            int num2 = data[j];
         
            data[j] = num1;
            data[i] = num2;
        }			
	 }	
    void insertAt(int element, int index){
        if(	index < 0 || index > arrayLength){
            System.out.println("Invalid index");
		}
        else {
            int k = data[index];
			data[index]=element;
			
            for(int j=1; j<data.length-index; j++){
            int f  = data[index+j];
            data[index + j] = k;
			k=f;
            } 
        }			
    }
	void removeAt(int index){
		 if(index < 0 || index > arrayLength){
            System.out.println("Invalid index");
		}
        else if (data[index] == 0){
           System.out.println("Arrya is empty");
        }
		else{
			data[index]=0;
			for(int i=index; i<data.length-(index+1);i++){
				data[i]=data[i+1];
			}
			data[data.length-1]=0;
		}
	}
	void makeItDouble(){
		int[] doubledata = new int[data.length*2];
		for(int i=0; i<data.length; i++){
		     doubledata[i] = data[i];
		}
		data = doubledata;
	}	
}