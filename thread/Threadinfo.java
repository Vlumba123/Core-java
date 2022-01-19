package thread;

public class Threadinfo {
	
	private static final String indent = null;

	public static void main(String[] args) {
		
		Thread t = new Thread("My Thread");
		log("",t);
	}

	private static void log(String string, Thread t) {
		System.out.println(indent + "THREAD NAME:"+ t.getName());
		System.out.println(indent + "Id:" + t.getId());
		System.out.println(indent + "Priority:" + t.getPriority());
		System.out.println(indent + "State:" + t.getState());
		System.out.println(indent + "Thread Group" + t.getThreadGroup().getName());
		System.out.println(indent + "IsAlive:" + t.isAlive());
		System.out.println(indent + "Is Daemon:" + t.isDaemon());
	}

}
