  class Counter<T>
    {
       T value;
       
        public Counter(T v1)
        {
            value = v1;
        }
        public boolean equal(T V2){
        	

        	if(V2.equals(value)) return true;
        	else return false;
        	
        }
        public T readValue()
        {
            return value;
        }
        public void updateValue(T v1)
        {
            value = v1;
        }
}
