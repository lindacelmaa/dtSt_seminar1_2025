package dataSt;

public class MyList {
	//mainigie

	private char[] list;
	private final int DEFAULT_SIZE = 7;
	private int size = DEFAULT_SIZE;
	private int counter = 0;

	//noklusetais konstruktors
	public MyList() {
		list = new char[size];

	}

	// argumenta konstruktors
	public MyList(int inputSize) {
		if(inputSize > 0) {
			size = inputSize;
		}
		list = new char[size];
	}

	private boolean isFull() {

			// garais if pieraksts

			/*if(size == counter) {
				return true;
			}
			else {
				return false;
			} */

			//iisais pieraksts
			//return (size == counter) ? true : false;

			//pavisam iisa forma ja ir true/false
		return (size == counter);

	}

	private boolean isEmpty() {
		if(counter == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public int length() {
		return counter;
	}

	private void resize() {
			
		if(size < 100) {
			size = size * 2;
		}
		else {
			size = (int)(size * 1.5); //135.5
		}

		char[] listNew = new char[size];

		for (int i = 0 ; i < counter; i++) {
			listNew[i] = list[i];
			}

		list = listNew;
		System.gc();

	}
	
	public void add(char element) {
		if (isFull()) {
			resize();
		}
		
		list[counter++] = element;
		//for(int i =0; i < list.length; i++ ) {
		//	list[i-1] = element;
		}
	}

}
