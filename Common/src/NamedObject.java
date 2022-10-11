
import java.io.Serializable;
import java.sql.Timestamp;

public class NamedObject implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String OBJECT_RETICLE_FAMILY = "RETICLEFAMILY";
	

	protected long instanceRrn = 0;
	
    protected String instanceId;
	
    protected String namedSpace;
	
    protected String instanceDesc;
	
    protected String instanceLongDesc;
	
    protected String object;
	
    protected String objectType;
	
    protected String objectSubtype;
	
    protected Integer currentVersion;
	
    protected Integer activeVersion;
	
    protected Long roleRrn;
	
    protected String instanceStatus;
    
    protected Timestamp createdTimestamp;
    
    protected Timestamp lastUpdateTimestamp;
    
    protected Long createdUserRrn;
    
    protected Long lastUpdateUserRrn;
    
    protected String roleId;

    protected String createdUserId;
	
    protected String lastUpdateUserId;
	
    protected String createdTime;
    
    protected String lastUpdateTime;
	
    protected String transId;
	
    protected String transPerformedby;

    protected String flagType = "";
	
    protected String systemUsed;

    
    public NamedObject(){
    }

    public NamedObject(String instanceId, String namedSpace, String object){
        if (instanceId != null) {
            this.instanceId = instanceId.toUpperCase();
        }
        this.namedSpace = namedSpace;
        this.object = object;
    }

    public NamedObject(long instanceRrn){
        this.instanceRrn = instanceRrn;
    }

    public NamedObject(String instanceId, String namedSpace, String object, String sys) {
        if (instanceId != null) {
            this.instanceId = instanceId;
        }
        this.namedSpace = namedSpace;
        this.object = object;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static String getObjectReticleFamily() {
        return OBJECT_RETICLE_FAMILY;
    }

    public long getInstanceRrn() {
        return instanceRrn;
    }

    public void setInstanceRrn(long instanceRrn) {
        this.instanceRrn = instanceRrn;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getNamedSpace() {
        return namedSpace;
    }

    public void setNamedSpace(String namedSpace) {
        this.namedSpace = namedSpace;
    }

    public String getInstanceDesc() {
        return instanceDesc;
    }

    public void setInstanceDesc(String instanceDesc) {
        this.instanceDesc = instanceDesc;
    }

    public String getInstanceLongDesc() {
        return instanceLongDesc;
    }

    public void setInstanceLongDesc(String instanceLongDesc) {
        this.instanceLongDesc = instanceLongDesc;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectSubtype() {
        return objectSubtype;
    }

    public void setObjectSubtype(String objectSubtype) {
        this.objectSubtype = objectSubtype;
    }

    public Integer getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(Integer currentVersion) {
        this.currentVersion = currentVersion;
    }

    public Integer getActiveVersion() {
        return activeVersion;
    }

    public void setActiveVersion(Integer activeVersion) {
        this.activeVersion = activeVersion;
    }

    public Long getRoleRrn() {
        return roleRrn;
    }

    public void setRoleRrn(Long roleRrn) {
        this.roleRrn = roleRrn;
    }

    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public Timestamp getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public Timestamp getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Timestamp lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    public Long getCreatedUserRrn() {
        return createdUserRrn;
    }

    public void setCreatedUserRrn(Long createdUserRrn) {
        this.createdUserRrn = createdUserRrn;
    }

    public Long getLastUpdateUserRrn() {
        return lastUpdateUserRrn;
    }

    public void setLastUpdateUserRrn(Long lastUpdateUserRrn) {
        this.lastUpdateUserRrn = lastUpdateUserRrn;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getTransPerformedby() {
        return transPerformedby;
    }

    public void setTransPerformedby(String transPerformedby) {
        this.transPerformedby = transPerformedby;
    }

    public String getFlagType() {
        return flagType;
    }

    public void setFlagType(String flagType) {
        this.flagType = flagType;
    }

    public String getSystemUsed() {
        return systemUsed;
    }

    public void setSystemUsed(String systemUsed) {
        this.systemUsed = systemUsed;
    }
}

/*
 * Modification Log Log No : Name : Modified Date: Description :
 */
