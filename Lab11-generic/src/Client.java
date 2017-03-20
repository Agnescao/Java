

 class Client
    {
        public static void main(String[] args)
        {
            Counter<Integer> c = new Counter(2);
            System.out.println("Res=" + c.readValue());
            System.out.println ("Equal =" + c.equal(4));
            c.updateValue(4);
            System.out.println ("Res=" + c.readValue());
            System.out.println ("Equal =" + c.equal(4));
            
            Counter<Double> c2 = new Counter(2.2);
            System.out.println("Res=" + c2.readValue());
            
            c.updateValue(4);
            System.out.println ("Res=" + c2.readValue());
        }
    }
