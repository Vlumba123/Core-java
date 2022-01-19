package file.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Marksheet  implements Externalizable {
	
	private String name = null;
    private int maths = 0;
private int physics = 0;
private int chemistry = 0;
 
 transient int  temp = 0;
 public Marksheet() {

 }
 public Marksheet(String na,int m,int p,int c) {
 	name = na;
 	maths = m;
 	physics = p;
 	chemistry = c;
 }
 
 public String getName() {
		return name;
	}
	public int getMaths() {
		return maths;
	}
	public int getPhysics() {
		return physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public int getTemp() {
		return temp;
	}
	public void writeExternal(ObjectOutput out) throws IOException {
 	out.writeObject(name);
 	out.writeInt(physics);
 	out.writeInt(chemistry);
 	out.writeInt(maths);
 	//Serialize transient variable
 	out.writeInt(temp);
 }
 
 public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
 	name = (String)  in.readObject();
 	physics = in.readInt();
 	chemistry = in.readInt();
 	maths = in.readInt();
 	
 	//deserialize transient variable
 	temp = in.readInt();
 }
 public String toString() {
 	return (name+maths+physics+chemistry+temp);
 }
 	
 	
 
 
}


