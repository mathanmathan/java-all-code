class BMW extends Car{

    public static void main(String[] args)
    {   
        BMW bmw = new BMW();
        bmw.accelerate(); 
        bmw.applyBreak(); 
        bmw.fixairBag(); 
        bmw.maintain_quality();  

        Car inspector = new BMW();
        inspector.accelerate();
//        inspector.maintain_quality();   // cannot be access this method in BMW class
     }
        void maintain_quality()             
        {                              
            {
                System.out.println("Super Quality Car");
            }
        }

    void accelerate()
        {
            System.out.println("High Speed");
        }

    void applyBreak()
        {
            System.out.println("Stopping");
        }

  } 

