package textClassify;

import java.util.List;
import java.util.TreeMap;

import com.qcloud.QcloudApiModuleCenter;
import com.qcloud.Module.Wenzhi;
import com.qcloud.Utilities.Json.JSONObject;

import dataSchema.News;

public class TextClassify {
    private String SecretId;
    private String SecretKey;
    private String RequestMethod;
    private String DefaultRegion;
    private QcloudApiModuleCenter module = null;
    public TextClassify(String SecretId, String SecretKey, String RequestMethod, String DefaultRegion){
    	this.SecretId = SecretId;
    	this.SecretKey = SecretKey;
    	this.RequestMethod = RequestMethod;
    	this.DefaultRegion = DefaultRegion;
    	setModule();
    }
    private void setModule(){
    	TreeMap<String, Object> config = new TreeMap<String, Object>();
    	config.put("SecretId", SecretId);
    	config.put("SecretKey", SecretKey);
    	config.put("RequestMethod", RequestMethod);
    	config.put("DefaultRegion", DefaultRegion);
    	module = new QcloudApiModuleCenter(new Wenzhi(),
				config);
    }
    private News getTextClassify(News news){
    	TreeMap<String, Object> params = new TreeMap<String, Object>();
    	params.put("title", news.getTitle());
    	params.put("content", news.getContent());
    	String result = null;
		try {
			/* call 方法正式向指定的接口名发送请求，并把请求参数params传入，返回即是接口的请求结果。 */
			result = module.call("TextClassify", params);
			JSONObject json_result = new JSONObject(result);
			if(!json_result.get("code").equals(0)){
				return null;
			} else{
				
				return news;
			}
		} catch (Exception e) {
			System.out.println("error..." + e.getMessage());
			return null;
		}
    }
	public String getSecretId() {
		return SecretId;
	}
	public void setSecretId(String secretId) {
		SecretId = secretId;
	}
	public String getSecretKey() {
		return SecretKey;
	}
	public void setSecretKey(String secretKey) {
		SecretKey = secretKey;
	}
	public String getRequestMethod() {
		return RequestMethod;
	}
	public void setRequestMethod(String requestMethod) {
		RequestMethod = requestMethod;
	}
	public String getDefaultRegion() {
		return DefaultRegion;
	}
	public void setDefaultRegion(String defaultRegion) {
		DefaultRegion = defaultRegion;
	}
	public QcloudApiModuleCenter getModule() {
		return module;
	}
}
