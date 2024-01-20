package test.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class Stdo {
@Id
@GeneratedValue
private int Id;
@Column(nullable = false)
private String Name;
	
private  String addres;
@Column(unique = false)
private long Number;
private int Age;
@CreationTimestamp
private Date insertiontime;
@UpdateTimestamp
private Date updatetime;


}
