class MyArrayList
{
	int data [];
	int arrayLength;
	int avail;
	
	MyArrayList(int length)
	{
		data = new int[length];
		arrayLength = length;
		avail = 0;
	}
	void insert (int element){
		if(avail > arrayLength)
		{
			System.out.println("Array is full. Cannot be inserted");
		}
		else{
			data[avail]= element;
			avail++;
		}
	}
	void printList(){
		for(int i=0; i<avail ;  i++)
		System.out.print(data[i]+" ,");
	}
	void printElement (int position){
		if (position >= arrayLength || position < 0)
		{
			System.out.println("Invalid position");
		}
		else 
		{
			System.out.println(position+"th value is "+data[position-1]);
		}
	}
	boolean FindElement (int element){
		boolean found = false;
		for(int i=0; i<avail; i++)
		{
			if (data[i]== element)
			{
				found = true;
				break;
			}
		}
		return found;
	}
	void insertAt(int element, int position){
		if (position >= arrayLength || position < 0)
		{
			System.out.println("Invalid position");
		}
		else if (avail >= arrayLength){
			System.out.println("Array is full");
		}
		else{
			int k = avail;
			for(int j=0; j<k-position+1; j++)
			{
				data[avail]=data[avail-1];
				avail=avail-1;
			}
			data[avail]=element;
			avail=k+1;
		}
	}
	void remove(int position)
	{
		if(position<0 || position>arrayLength)
		{
			System.out.println("Invalid Index");
		}
		else if(avail==0){
			System.out.println("Array is Empty , cannot be deleted.");
		}
		else{
			for(int j=position-1; j<avail-1; j++)
			{
				data[j]=data[j+1];
			}
			data[avail-1]=0;
			avail--;
		}
	}
	void removeLast(){
		data[avail]=0;
		avail--;
	}
		
}