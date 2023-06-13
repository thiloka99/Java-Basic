class ArrayList{
	int [] data ;
	
	ArrayList(int size){
		data = new int [size];
	}
	void reset(){
		for(int i=0; i<data.length; i++){
			data[i] = 0;
		}
	}
	void replaceAt(int element, int index){
		for(int i=0; i<data.length; i++){
			data[index] = element;
		}
		System.out.print(data[index]+",");
	}
	void getElementAt(int index){
		for(int i=index; i<data.length-1; i++){
			data[index] = data[index+1];
		}
		//System.out.print(data[index]);
	}
	void print(){
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+",");
		}
		System.out.println();
	}
	int isContain(int element){
		for(int i=0; i<data.length; i++){
			if(data[element] == data[i]){
				return data[0]= data[element];
			}
		}
	}
	void swap(int i, int j){
		for(int i=0; i<data.length; i++){
			for(int j=0; j<data.length; j++){
			int temp = data[j];
			data[j] = data[i];
			data[i] = temp;
			}
		}
	}
	void insertAt(int element , int index){
		for(int i=0; i<data.length-1; i++){
			data[i] = data[i+1];
		}
	}
	void removeAt(int index){
		for(int i=0; i<data.length; i++){
			
		
		
				
}