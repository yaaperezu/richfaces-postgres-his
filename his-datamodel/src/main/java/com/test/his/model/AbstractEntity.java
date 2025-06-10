package com.test.his.model;

import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

/**
 * Class implementing the basic properties of all entities.
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private long version;
	private String name;

	@Id
	@GeneratedValue
	@Column(name = "id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Version
	@Column(name = "version")
	public long getVersion() { // ¡ELIMINAR 'final' DE AQUÍ!
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@NotNull
	@Length(max = 200)
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
