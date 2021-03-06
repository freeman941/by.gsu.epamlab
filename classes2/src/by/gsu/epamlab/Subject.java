package by.gsu.epamlab;

public class Subject {
private Material material;
private String name;
private double volume;
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(Material material, String name, double volume) {
	super();
	this.material = material;
	this.name = name;
	this.volume = volume;
}
public Material getMaterial() {
	return material;
}
public void setMaterial(Material material) {
	this.material = material;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getVolume() {
	return volume;
}
public void setVolume(double volume) {
	this.volume = volume;
}
public double getMass(){
	return material.getDensity()*volume;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return name+";"+material.getName()+";"+material.getDensity()+";"+volume+";"+getMass();
}

}
