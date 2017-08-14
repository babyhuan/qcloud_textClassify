import java.util.TreeMap;

import com.qcloud.Module.Wenzhi;
import com.qcloud.QcloudApiModuleCenter;
import com.qcloud.Utilities.Json.JSONObject;

public class Demo {
	public static void main(String[] args) {
		/* 如果是循环调用下面举例的接口，需要从此处开始你的循环语句。切记！ */
		TreeMap<String, Object> config = new TreeMap<String, Object>();
		config.put("SecretId", "AKID9C7rRulAZpu9KPx4FSZ8bxFQPF1woQbx");
		config.put("SecretKey", "Om5H5mIiy4hAVjcU9iKcjfVAi6MSTPIC");
		/* 请求方法类型 POST、GET */
		config.put("RequestMethod", "POST");
		/* 区域参数，可选: gz:广州; sh:上海; hk:香港; ca:北美;等。 */
		config.put("DefaultRegion", "gz");

		/*
		 * 你将要使用接口所在的模块，可以从 官网->云api文档->XXXX接口->接口描述->域名
		 * 中获取，比如域名：cvm.api.qcloud.com，module就是 new Cvm()。
		 */
		/*
		 * 示例：DescribeInstances
		 * 的api文档地址：http://www.qcloud.com/wiki/v2/DescribeInstances
		 */
		QcloudApiModuleCenter module = new QcloudApiModuleCenter(new Wenzhi(),
				config);

		TreeMap<String, Object> params = new TreeMap<String, Object>();
		/* 将需要输入的参数都放入 params 里面，必选参数是必填的。 */
		/* DescribeInstances 接口的部分可选参数如下 */
//		params.put("title", "黄岳泰跨界执导《别有动机》9月17日全国公映");
//		params.put("content",
//				"\t犯罪推理动作电影《别有动机》主创近日到佛山举办见面会宣传活动，导演黄岳泰携主演林家栋、任达华分享了拍摄点滴。影片主要讲述了两件相隔20年的高仿绑架案背后的故事，情节内容涉及两代人恩怨，上演了一场爱恨交织的绝命之恋。这也是香港金牌摄影师黄岳泰跨界做导演的首部荧屏处女作，于17日全国公映。\n" +
//				"\t曾9次夺得香港电影金像奖最佳摄影奖项的黄岳泰凭借《别有动机》转行当导演，当天活动中他表示自己已圆梦。谈到此次转型，他说：“一直有当导演的冲动，之所以选这个题材，是因为自己喜欢有思考空间的电影，可以边推理边看，所以才决定拍一部悬疑商业犯罪片，有别于以往的港产片，不再一味最求快节奏，会留时间给观众思考。”作为新人导演，黄岳泰十分自信，认为拍好戏的重点在于与演员多沟通。\n" +
//				"\t林家栋在《别有动机》中饰演犯罪心理学专家，与秦岚上演虐心感情纠葛。林家栋表示，由于此前已拍摄过很多相似类型的影片，因此自己一开始拒绝了该电影的邀约。最终决定出演，是因为他被电影中的“情”打动，因为这份情让他看到了这个角色与众不同的一面。\n");
//		{"codeDesc":"Success","code":0,"classes":[{"conf":1,"class":"影视","class_num":6},{"conf":0,"class":"明星","class_num":55},{"conf":0,"class":"文化","class_num":61}],"message":""}
		params.put("title", "村级“阳光财务”还干部“清白”给群众“明白”");
		params.put("content",
				"\t　　阳春市近年来在全市推行村级“阳光财务”工作，解决了村级财务公开不及时、公开内容复杂分散、公开地点单一、报表过于专业化等问题，为群众搭建一个便于监督村级财务收支情况的平台，让村级财务管理在“阳光”下运行，还村级干部一个“清白”，给党员群众一个“明白”。\n" +
				"\t一、立足于群众看得懂，用大众语言公示\n" +
				"\t　　制定《每月财务收支情况公布表》，公布的内容共五大项：上月银行账户余额、本月总收入、本月总支出、本月银行账户余额和本年度以来总收支情况。其中，“本月总收入”项细分“出租及承包收入”、“企业上缴利润”、“补助收入”和“其他收入”等小项，“本月总支出”项细分“干部报酬”、“会议费”、“电话费”、“邮寄费”、“水电费”、“接待费”、“误工补贴”和“其他支出”等小项。整个公布表的栏目设置摒弃了诸如“固定资产”、“流动资产”等会计专业术语，公开内容简明、直观，村里收入多少、支出多少、剩余多少，群众一目了然，这种做法得到了群众的认可。\n" +
				"\t二、立足于群众看得见，在户外群众集聚地点公示\n" +
				"\t　　为提高群众参与村级财务公开的积极性和监督效果，公布表一式三份，即：留底备案一份，村委会办公场所内张贴一份，村委会办公场所外张贴一份。对于村委会办公场所外张贴地方的选址，规定要在群众习惯聚集的地方、最显眼位置，如村场店铺、公园、广场、学校等适当位置设置公示牌张贴公示。为了便于群众监督，市委组织部按照市里从市管党费补助一点、镇（街道）补助一点的“两个一点”办法筹集经费27.44万元，统一定制村级“阳光财务”公示牌。群众一看到“阳光财务”这个标识，就知道是公布村级财务收支情况的地方。\n" +
				"\t三、立足于群众看得清，用大表格大字体公示\n" +
				"\t　　以往公开的村级财务报表一般使用A4纸规格（21cm×29.7cm），报表的内容、数字字号较小，群众查看比较困难。为便于群众查看报表，现将《村（居）委会每月财务收支公布表》规格设为60cm×90cm，大约为一张报纸大小，纸张材质选取较为坚韧的铜版纸，统一印制并下发到各村（社区）。村民认为这种改变效果很好，迎合了当前农村的实际工作需求。\n" +
				"\t四、立足于群众看得及时，在每月规定时间公示\n" +
				"\t　　村（居）委会每月把上月的财务数据填写在公布表上，加盖村（居）委会公章和负责人、监委会成员签名确定，并在每月10日前张贴公布。明确规定各村（居）委会必须指定专人负责阳光财务工作的落实，与此同时，做到“两级培训，三级监督”。“两级培训”即市镇两级都举办培训班，对村（居）委会主任、财务人员进行工作培训。“三级监督”：一是各村（社区）党组织书记或村（居）委会主任每月进行自查，督促专门负责人抓好落实；二是镇（街道）每月派人到各村（居）委会进行实地检查；三是市委组织部、市民政局、市财政局等单位组成联合队伍不定期到镇（街道）、村（居）委会抽查。\n" +
				"\t　　村级“阳光财务”制度推行以来，抑制了少数村干部大手大脚、胡支乱花的现象，有效预防了村干部在经济上犯错误，群众针对村（居）财务方面的信访投诉日益减少。\n" +
				"\t作者单位：阳春市决策咨询和政策研究室\n");
		/*在这里指定所要用的签名算法，不指定默认为HmacSHA1*/
		//params.put("SignatureMethod", "HmacSHA256");
//		{"codeDesc":"Success","code":0,"classes":[{"conf":1,"class":"别的政治类别","class_num":42},{"conf":0,"class":"未分类","class_num":0},{"conf":0,"class":"别的社会类别","class_num":41}],"message":""}
		/* generateUrl方法生成请求串,可用于调试使用 */
		//System.out.println(module.generateUrl("DescribeInstances", params));
		String result = null;
		try {
			/* call 方法正式向指定的接口名发送请求，并把请求参数params传入，返回即是接口的请求结果。 */
			result = module.call("TextClassify", params);
			JSONObject json_result = new JSONObject(result);
			System.out.println(json_result);
		} catch (Exception e) {
			System.out.println("error..." + e.getMessage());
		}

	}
}
