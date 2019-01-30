package singleton;


	 class Eagerinit  
	{ 
	  // public instance initialized when loading the class 
	  public static Eagerinit instance = new Eagerinit(); 
	  
	  private Eagerinit() 
	  { 
	    // private constructor 
		  System.out.println("Eager Instantiation");
	  }
	  
	 
	}
	  class Lazyinit {
			private static Lazyinit instance = null;
			
			private Lazyinit()
			{
				System.out.println("Lazy Singleton being initialized");
			}
			
			public static Lazyinit getInstance()
			{
				if(instance == null)
					instance = new Lazyinit();
				return instance;
			}
			  
		}
	  class ThreadSafeinit {

			// private instance, so that it can be 
			  // accessed by only by getInstance() method 
			  private static ThreadSafeinit instance; 
			  
			  private ThreadSafeinit()  
			  { 
			    // private constructor 
			  } 
			  
			 //synchronized method to control simultaneous access 
			  synchronized public static ThreadSafeinit getInstance()  
			  { 
			    if (instance == null)  
			    { 
			      // if instance is null, initialize 
			      instance = new ThreadSafeinit(); 
			    } 
			    System.out.println("Thread-safe Instantiation");
			    return instance; 
			  } 
			 
		     
				  
			  }
	   class Singleton {
			
			public static void main(String[] args) {
			

				Eager obj1=Eager.instance;
		       Lazy obj2= Lazy.getInstance();
			  ThreadSafe obj3= ThreadSafe.getInstance();
				
			}
		}

	  
	  
	


