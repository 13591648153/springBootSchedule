package com.yd.test.service;


import com.alibaba.fastjson.annotation.JSONField;
//import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Zabbix4.0的item.属性值写法与Zabbix一致
 */
public class ZabbixItem {
    //唯一的监控项ID
    private String itemid;
    // 更新监控项的时间间隔 带有时间单位.
    private String delay;
    //该监控项所属的主机ID
    private String hostid;
    //监控项主机接口的ID。 仅用于主机项
    private String interfaceid;
    //Item key
//    @JsonProperty(value = "key_")
    @JSONField(name="key_")
    private String itemKey;
    // item name
    private String name;
    //类型 0 - Zabbix agent;1 - SNMPv1 agent;2 - Zabbix trapper;3 - simple check;
    //4 - SNMPv2 agent;5 - Zabbix internal;6 - SNMPv3 agent;7 - Zabbix agent (active);8 - Zabbix aggregate;
    //9 - web item;10 - external check;11 - database monitor;12 - IPMI agent;
    //13 - SSH agent;14 - TELNET agent;15 - calculated;16 - JMX agent;
    //17 - SNMP trap;18 - Dependent item;19 - HTTP agent;
    private Integer type;
    //HTTP agent监控项类型需要
    private String url;
    //监控项信息类型.0 - numeric float;1 - character;2 - log;
    //3 - numeric unsigned;4 - text.
    @JSONField(name = "value_type")
    private Integer valueType;
    //HTTP agent监控项字段 允许和trapper监控项一样的填充值 0 - (default) 1 - Allow
    @JSONField(name = "allow_traps")
    private Integer allowTraps;
    //仅在SSH agent items or HTTP agent items中使用
    // SSH0 - (default) password;1 - public key.
    // HTTP 0 - (default) none 1 - basic 2 - NTLM
    private Integer authtype;
    //监控项说明.
    private String description;
    //当更新监控项出错时的错误文本
    private String error;
    // 0 - a plain item; 4 - a discovered item.
    private Integer flags;
    //监控项字段。合并数据时跟随重定向 0 - Do not follow redirects.1 - (default) Follow redirects.
    @JSONField(name = "follow_redirects")
    private Integer followRedirects;
    // HTTP agent 监控项字段 { “User-Agent”: “Zabbix” }
    private Object headers;
    //一个历史数据被保存的时长的时间单位。接受用户宏。default 90d.
    private String history;
    // HTTP agent 监控项字段。HTTP(S)代理连接字符串
    @JSONField(name = "http_proxy")
    private String httpProxy;
    //监控项填充的主机资产的ID default:0
    @JSONField(name = "inventory_link")
    private String inventoryLink;
    //PMI传感器。仅用于IPMI监控项
    @JSONField(name = "ipmi_sensor")
    private String ipmiSensor;
    // JMX agent自定义的连接字符串
    @JSONField(name = "jmx_endpoint")
    private String jmxEndpoint;
    //监控项最后被更新的时间
    private Date lastclock;
    //监控项最后被更新的纳秒
    private Integer lastns;
    //监控项最新的值
    private String lastvalue;
    //日志条目的时间格式。仅用于日志监控项
    private String logtimefmt;
    //允许多达3个依赖监控项的递归和监控项的最大计数等于999
    @JSONField(name = "master_itemid")
    private Integer masterItemid;
    //被监控的日志文件最后一次被更新的时间
    private Date mtime;
    //HTTP agent监控项字段。返回数据应被转换成JSON 0 - (default) Store raw 1 - Convert to JSON
    @JSONField(name = "output_format")
    private Integer outputFormat;
    // 取决于监控项类型的附加参数
    private String params;
    //认证的密码 当贝JMX使用时，用户名应和密码一起提供，或者同时留空
    private String password;
    //监控项监控的端口。仅用于SMNP监控项
    private String port;
    //HTTP agent字段。存储在post属性的post的数据类型
    //0 - (default) Raw data.2 - JSON data 3 - XML data
    @JSONField(name = "post_type")
    private Integer postType;
    // HTTP agent字段。HTTP(S)请求报文。仅用于post_type
    private String posts;
    // 监控项的前一个值
    private String prevvalue;
    // 私钥文件名
    private String privatekey;
    //公钥的文件名
    private String publickey;
    //HTTP agent监控项字段。查询参数。带有键值对的数组对象，值可为空
    @JSONField(name = "query_fields")
    private List<Map<String,String>> queryFields;
    //HTTP agent监控项字段。请求方法的类型
    //0 - GET,1 - (default) POST,2 - PUT,3 - HEAD
    @JSONField(name = "request_method")
    private Integer requestMethod;
    //HTTP agent监控项字段。被存储的响应的部分
    //0 - (default) Body.1 - Headers,2 - Both body and headers will be stored
    @JSONField(name = "retrieve_mode")
    private Integer retrieveMode;
    //仅用于SNMPv1 and SNMPv2 监控项0 - (default) Body.2 - Both body and headers will be stored
    @JSONField(name = "snmp_community")
    private String snmpCommunity;
    //SNMP OID
    @JSONField(name = "snmp_oid")
    private String snmpOid;
    //SNMPv3认证密码。仅用于SNMPv3监控项
    @JSONField(name = "snmpv3Authpassphrase")
    private String snmpv3_authpassphrase;
    //SNMPv3认证协议。仅用于SNMPv3监控项0 - (default) MD5,1 - SHA
    @JSONField(name = "snmpv3_authprotocol")
    private Integer snmpv3Authprotocol;
    //仅用于SNMPv3监控项

    private String snmpv3Contextname;
    // SNMPv3私钥。仅用于SNMPv3监控项

    private String snmpv3Privpassphrase;
    // SNMPv3文私密协议。仅用于SNMPv3监控项 0 - (default) DES 1 - AES

    private Integer snmpv3Privprotocol;
    //SNMPv3安全等级。仅用于SNMPv3监控项 0 - noAuthNoPriv 1 - authNoPriv 2 - authPriv

    private String snmpv3Securitylevel;
    // SNMPv3安全名称。仅用于SNMPv3监控项

    private String snmpv3Securityname;
    //HTTP agent监控项字段。公共SSL 秘钥的文件路径

    private String sslCertFile;
    //HTTP agent监控项字段。私有SLL秘钥的文件路径

    private String sslKeyFile;
    // HTTP agent监控项字段。SSL 秘钥的文件密码

    private String sslKeyPassword;
    //State of the item 0 - (default) normal;1 - not supported
    private Integer state;
    //0 - (default) enabled item 1 - disabled item
    private Integer status;
    // HTTP agent监控项字段。以逗号分隔的HTTP 状态码的范围。也支持作为逗号分隔的用户宏列表

    private String statusCodes;
    //父模板的ID
    private String templateid;
    //HTTP agent监控项字段。监控项数据轮询超时时间。支持用户宏default: 3s  maximum value: 60s
    private String timeout;
    // 接受的主机。仅用于trapper监控项或者HTTP agent监控项

    private String trapperHosts;
    // 时间单位，数据数据被保存的时间长度。也接受用户宏 Default: 365d.
    private String trends;
    //Value units. 值的单位。
    private String units;
    //JMX and HTTP agent items. 认证的用户名
    private String username;
    //关联映射值的ID
    private String valuemapid;
    //验证URL中的主机名处于通用名称字段或主机证书的主题备用名称字段

    private String verifyHost;
    //HTTP agent字段。验证主机的合法性

    private Integer verifyPeer;

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public String getInterfaceid() {
        return interfaceid;
    }

    public void setInterfaceid(String interfaceid) {
        this.interfaceid = interfaceid;
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public Integer getAllowTraps() {
        return allowTraps;
    }

    public void setAllowTraps(Integer allowTraps) {
        this.allowTraps = allowTraps;
    }

    public Integer getAuthtype() {
        return authtype;
    }

    public void setAuthtype(Integer authtype) {
        this.authtype = authtype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Integer getFollowRedirects() {
        return followRedirects;
    }

    public void setFollowRedirects(Integer followRedirects) {
        this.followRedirects = followRedirects;
    }

    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getHttpProxy() {
        return httpProxy;
    }

    public void setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
    }

    public String getInventoryLink() {
        return inventoryLink;
    }

    public void setInventoryLink(String inventoryLink) {
        this.inventoryLink = inventoryLink;
    }

    public String getIpmiSensor() {
        return ipmiSensor;
    }

    public void setIpmiSensor(String ipmiSensor) {
        this.ipmiSensor = ipmiSensor;
    }

    public String getJmxEndpoint() {
        return jmxEndpoint;
    }

    public void setJmxEndpoint(String jmxEndpoint) {
        this.jmxEndpoint = jmxEndpoint;
    }

    public Date getLastclock() {
        return lastclock;
    }

    public void setLastclock(Date lastclock) {
        this.lastclock = lastclock;
    }

    public Integer getLastns() {
        return lastns;
    }

    public void setLastns(Integer lastns) {
        this.lastns = lastns;
    }

    public String getLastvalue() {
        return lastvalue;
    }

    public void setLastvalue(String lastvalue) {
        this.lastvalue = lastvalue;
    }

    public String getLogtimefmt() {
        return logtimefmt;
    }

    public void setLogtimefmt(String logtimefmt) {
        this.logtimefmt = logtimefmt;
    }

    public Integer getMasterItemid() {
        return masterItemid;
    }

    public void setMasterItemid(Integer masterItemid) {
        this.masterItemid = masterItemid;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Integer getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(Integer outputFormat) {
        this.outputFormat = outputFormat;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getPostType() {
        return postType;
    }

    public void setPostType(Integer postType) {
        this.postType = postType;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getPrevvalue() {
        return prevvalue;
    }

    public void setPrevvalue(String prevvalue) {
        this.prevvalue = prevvalue;
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    public List<Map<String, String>> getQueryFields() {
        return queryFields;
    }

    public void setQueryFields(List<Map<String, String>> queryFields) {
        this.queryFields = queryFields;
    }

    public Integer getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(Integer requestMethod) {
        this.requestMethod = requestMethod;
    }

    public Integer getRetrieveMode() {
        return retrieveMode;
    }

    public void setRetrieveMode(Integer retrieveMode) {
        this.retrieveMode = retrieveMode;
    }

    public String getSnmpCommunity() {
        return snmpCommunity;
    }

    public void setSnmpCommunity(String snmpCommunity) {
        this.snmpCommunity = snmpCommunity;
    }

    public String getSnmpOid() {
        return snmpOid;
    }

    public void setSnmpOid(String snmpOid) {
        this.snmpOid = snmpOid;
    }

    public String getSnmpv3_authpassphrase() {
        return snmpv3_authpassphrase;
    }

    public void setSnmpv3_authpassphrase(String snmpv3_authpassphrase) {
        this.snmpv3_authpassphrase = snmpv3_authpassphrase;
    }

    public Integer getSnmpv3Authprotocol() {
        return snmpv3Authprotocol;
    }

    public void setSnmpv3Authprotocol(Integer snmpv3Authprotocol) {
        this.snmpv3Authprotocol = snmpv3Authprotocol;
    }

    public String getSnmpv3Contextname() {
        return snmpv3Contextname;
    }

    public void setSnmpv3Contextname(String snmpv3Contextname) {
        this.snmpv3Contextname = snmpv3Contextname;
    }

    public String getSnmpv3Privpassphrase() {
        return snmpv3Privpassphrase;
    }

    public void setSnmpv3Privpassphrase(String snmpv3Privpassphrase) {
        this.snmpv3Privpassphrase = snmpv3Privpassphrase;
    }

    public Integer getSnmpv3Privprotocol() {
        return snmpv3Privprotocol;
    }

    public void setSnmpv3Privprotocol(Integer snmpv3Privprotocol) {
        this.snmpv3Privprotocol = snmpv3Privprotocol;
    }

    public String getSnmpv3Securitylevel() {
        return snmpv3Securitylevel;
    }

    public void setSnmpv3Securitylevel(String snmpv3Securitylevel) {
        this.snmpv3Securitylevel = snmpv3Securitylevel;
    }

    public String getSnmpv3Securityname() {
        return snmpv3Securityname;
    }

    public void setSnmpv3Securityname(String snmpv3Securityname) {
        this.snmpv3Securityname = snmpv3Securityname;
    }

    public String getSslCertFile() {
        return sslCertFile;
    }

    public void setSslCertFile(String sslCertFile) {
        this.sslCertFile = sslCertFile;
    }

    public String getSslKeyFile() {
        return sslKeyFile;
    }

    public void setSslKeyFile(String sslKeyFile) {
        this.sslKeyFile = sslKeyFile;
    }

    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    public void setSslKeyPassword(String sslKeyPassword) {
        this.sslKeyPassword = sslKeyPassword;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusCodes() {
        return statusCodes;
    }

    public void setStatusCodes(String statusCodes) {
        this.statusCodes = statusCodes;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getTrapperHosts() {
        return trapperHosts;
    }

    public void setTrapperHosts(String trapperHosts) {
        this.trapperHosts = trapperHosts;
    }

    public String getTrends() {
        return trends;
    }

    public void setTrends(String trends) {
        this.trends = trends;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getValuemapid() {
        return valuemapid;
    }

    public void setValuemapid(String valuemapid) {
        this.valuemapid = valuemapid;
    }

    public String getVerifyHost() {
        return verifyHost;
    }

    public void setVerifyHost(String verifyHost) {
        this.verifyHost = verifyHost;
    }

    public Integer getVerifyPeer() {
        return verifyPeer;
    }

    public void setVerifyPeer(Integer verifyPeer) {
        this.verifyPeer = verifyPeer;
    }

    @Override
    public String toString() {
        return "ZabbixItem{" +
                "itemid='" + itemid + '\'' +
                ", delay='" + delay + '\'' +
                ", hostid='" + hostid + '\'' +
                ", interfaceid='" + interfaceid + '\'' +
                ", itemKey='" + itemKey + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", url='" + url + '\'' +
                ", valueType=" + valueType +
                ", allowTraps=" + allowTraps +
                ", authtype=" + authtype +
                ", description='" + description + '\'' +
                ", error='" + error + '\'' +
                ", flags=" + flags +
                ", followRedirects=" + followRedirects +
                ", headers=" + headers +
                ", history='" + history + '\'' +
                ", httpProxy='" + httpProxy + '\'' +
                ", inventoryLink='" + inventoryLink + '\'' +
                ", ipmiSensor='" + ipmiSensor + '\'' +
                ", jmxEndpoint='" + jmxEndpoint + '\'' +
                ", lastclock=" + lastclock +
                ", lastns=" + lastns +
                ", lastvalue='" + lastvalue + '\'' +
                ", logtimefmt='" + logtimefmt + '\'' +
                ", masterItemid=" + masterItemid +
                ", mtime=" + mtime +
                ", outputFormat=" + outputFormat +
                ", params='" + params + '\'' +
                ", password='" + password + '\'' +
                ", port='" + port + '\'' +
                ", postType=" + postType +
                ", posts='" + posts + '\'' +
                ", prevvalue='" + prevvalue + '\'' +
                ", privatekey='" + privatekey + '\'' +
                ", publickey='" + publickey + '\'' +
                ", queryFields=" + queryFields +
                ", requestMethod=" + requestMethod +
                ", retrieveMode=" + retrieveMode +
                ", snmpCommunity='" + snmpCommunity + '\'' +
                ", snmpOid='" + snmpOid + '\'' +
                ", snmpv3_authpassphrase='" + snmpv3_authpassphrase + '\'' +
                ", snmpv3Authprotocol=" + snmpv3Authprotocol +
                ", snmpv3Contextname='" + snmpv3Contextname + '\'' +
                ", snmpv3Privpassphrase='" + snmpv3Privpassphrase + '\'' +
                ", snmpv3Privprotocol=" + snmpv3Privprotocol +
                ", snmpv3Securitylevel='" + snmpv3Securitylevel + '\'' +
                ", snmpv3Securityname='" + snmpv3Securityname + '\'' +
                ", sslCertFile='" + sslCertFile + '\'' +
                ", sslKeyFile='" + sslKeyFile + '\'' +
                ", sslKeyPassword='" + sslKeyPassword + '\'' +
                ", state=" + state +
                ", status=" + status +
                ", statusCodes='" + statusCodes + '\'' +
                ", templateid='" + templateid + '\'' +
                ", timeout='" + timeout + '\'' +
                ", trapperHosts='" + trapperHosts + '\'' +
                ", trends='" + trends + '\'' +
                ", units='" + units + '\'' +
                ", username='" + username + '\'' +
                ", valuemapid='" + valuemapid + '\'' +
                ", verifyHost='" + verifyHost + '\'' +
                ", verifyPeer=" + verifyPeer +
                '}';
    }
}
