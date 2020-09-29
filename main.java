public class Main {

  public static void main(String[] args) {
    Counter mili = new Counter (100,7);
		Counter hours = new Counter(24, 1);
		Counter mins = new Counter(60, 59);
		Counter sec = new Counter(60, 58);

		int i = 0;
		while(i < 10){
      
      System.out.println(hours.printCount() + " : " + 
                          mins.printCount() + " : " + 
                          sec.printCount() + " : " + 
                          mili.printCount());
			
      mili.tick();
      
      if (mili.getCount() == 0){
      sec.tick();
			  if(sec.getCount() == 0){
				mins.tick();
        if(mins.getCount() == 0){
				  hours.tick();
			  }
			}

			i++;
		}
  }
}
}
