import java.util.UUID;

public  class Singleton
{
    private static volatile Singleton obj;
    private static UUID id ;


    public static Singleton getInstance()
    {
        Singleton result = obj;
        if (result != null)
        {
            return result;
        }
        synchronized(Singleton.class)
        {
            if (obj == null)
            {
                obj = new Singleton();
            }
            return obj;
        }

    }

    public synchronized UUID getID()
    {
//        return idCounter++ ;
        UUID uuid = UUID.randomUUID();
        id=uuid;
        return id;
    }
}
