
package com.example.demo.Trainee;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee")
public class TraineeEntity {
@Id
int traineeid;
String traineename;
String traineedomain;
String traineelocation;
public int getTraineeid() {
	return traineeid;
}
public void setTraineeid(int traineeid) {
	this.traineeid = traineeid;
}
public String getTraineename() {
	return traineename;
}
public void setTraineename(String traineename) {
	this.traineename = traineename;
}
public String getTraineedomain() {
	return traineedomain;
}
public void setTraineedomain(String traineedomain) {
	this.traineedomain = traineedomain;
}
public String getTraineelocation() {
	return traineelocation;
}
public void setTraineelocation(String traineelocation) {
	this.traineelocation = traineelocation;
}

}
