package eu.neclab.ngsildbroker.commons.datatypes;

import java.util.List;
import java.util.UUID;

public abstract class BaseEntry {
	protected String name;
	protected Long observedAt = -1l;
	protected List<Property> properties;
	private Object refToAccessControl;
	protected List<Relationship> relationships;
	protected int timeSeriesId;
	protected String type;
	private Long createdAt = -1l;
	private Long modifiedAt = -1l;
	protected String dataSetId;

	public BaseEntry(String dataSetId) {
		this.dataSetId = dataSetId;
		if(this.dataSetId == null || this.dataSetId.isBlank()) {
			this.dataSetId = UUID.randomUUID().toString();
		}
	}
	public String getDataSetId() {
		return dataSetId;
	}
	public void setDataSetId(String dataSetId) {
		this.dataSetId = dataSetId;
		if(this.dataSetId == null || this.dataSetId.isBlank()) {
			this.dataSetId = UUID.randomUUID().toString();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getObservedAt() {
		return observedAt;
	}

	public void setObservedAt(Long observedAt) {
		this.observedAt = observedAt;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public Object getRefToAccessControl() {
		return refToAccessControl;
	}

	public void setRefToAccessControl(Object refToAccessControl) {
		this.refToAccessControl = refToAccessControl;
	}

	public List<Relationship> getRelationships() {
		return relationships;
	}

	public void setRelationships(List<Relationship> relationships) {
		this.relationships = relationships;
	}

	public int getTimeSeriesId() {
		return timeSeriesId;
	}

	public void setTimeSeriesId(int timeSeriesId) {
		this.timeSeriesId = timeSeriesId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	public long getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Long modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

}