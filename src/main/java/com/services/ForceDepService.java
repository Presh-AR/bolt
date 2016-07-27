package com.services;

import java.util.ArrayList;
import java.util.List;

import com.domain.MultiPleDeploymentDO;
import com.tasks.DeployTask;
import com.tasks.ExecuteScript;
import com.tasks.GetPackagesTask;
import com.tasks.QuickDeployTask;
import com.tasks.ReleaseTask;
import com.tasks.RetrieveClientTask;
import com.tasks.RetrieveTask;
import com.tasks.SubmitForApprovalTask;
import com.tasks.UpdatePackagesTask;
import com.util.Constants;

public class ForceDepService {

	public ForceDepService() {
		super();

		// c_t =
		// "00DS0000003Km6L!AQsAQFe_T3SXsKTpVRuZxE44jBIKQz3AsTRouOS1pTx2JeyqIEa0Q0flNY3DpKGEl6Av5wW1t2.5j4oUcOr0vhcxpTBD8IH1";

		/*String metadataLogId = "a043600000203Zf";
		String bOrgId = "00D36000000L6GgEAK";
		String bOrgToken = "00D36000000L6Gg!ARQAQMFfA7b.IUpTRmyEL90HFf12l0haQvUb8ck3_hYmr0OOkQMSB5Gjcp_4HdtOmQMNPyF5I7AhOU1trxMXP52BKHu_I25D";
		String bOrgURL = "https://na30.salesforce.com";
		String refreshToken = "5Aep861QbHyftz0nI8oi1AwNQkWJGd9W7nKhOtgyNi1fQckfNgqQnT4Iws.pyzhgQETur0QNspxODbEGR8LSJQ5";
		retrieveClient(bOrgId, bOrgToken, bOrgURL, refreshToken, metadataLogId);
		/*
		 * * getPackages(bOrgId, bOrgToken, bOrgURL, refreshToken,
		 * releaseParentId, releaseParentName, releaseStatus, metadataLogId); //
		 * retrieve(bOrgId, bOrgToken, bOrgURL,refreshToken, metadataLogId);
		 * 
		 * // release(bOrgId, bOrgToken, bOrgURL, refreshToken, releaseParentId,
		 * // releaseParentName, releaseStatus);
		 */

		/*
		 * String bOrgId = "00D610000006tjPEAQ"; String bOrgToken =
		 * "00D610000006tjP!AQ4AQI2RxQGJa.1iw9O5E0jEzH7.j9wTl9TcEDgJM6xzB4BdHocD0wHk99z9e7w7fB6Z9mmliNvCu9pDHKLmRpo_Z.i7nlNf"
		 * ; String bOrgURL = "https://na34.salesforce.com"; String refreshToken
		 * =
		 * "5Aep861tbt360sO1.uO0UjNoRyP9rNbAguo__QeBtE9I0DtmCCr9I0aAzS9A5Vnfr.9g909nJRwVrb0qp4fHnVG"
		 * ; // String releaseParentName = "srikanth-release182"; // String
		 * releaseParentId="a0B610000023fCKEAY"; // String releaseStatus =
		 * "Active"; String metadataLogId = "a0561000002BiDU"; deploy(bOrgId,
		 * bOrgToken, bOrgURL, refreshToken, metadataLogId, true);
		 */

		/*
		 * String metadataLogId = "a0436000001VlYbAAK"; String bOrgId
		 * ="00D36000000L6GgEAK"; String bOrgToken =
		 * "00D36000000L6Gg!ARQAQCUlyt7FtmKzKJ0ZjsoMpnMfor1Zd1JcjQpf24mmwOi5bXpIehAugjKCG7AzrCQ7Vz2s7ZKOdXXABxMmpr1_kU8WQHio"
		 * ; String bOrgURL = "https://na30.salesforce.com"; String
		 * bOrgRefreshToken =
		 * "5Aep861QbHyftz0nI8oi1AwNQkWJGd9W7nKhOtgJnHqggUNq_GGdfHMdBXXOm4D8lCYa2h0boWMpDtAr15jbLRL"
		 * ;
		 * 
		 * 
		 * String sOrgId = "00D36000000L6NwEAK"; String sOrgToken =
		 * "00D36000000L6Nw!AQgAQC_1cxFlaSo5Rrh7jw6S8dU8ZI01dDqgt5fdD1SKDdNFbD_nP3_41K.0HTaNI2SA4N54p2LM8y8bxOuA5aeJs9p8tBEI"
		 * ; String sOrgURL = "https://na30.salesforce.com"; String
		 * sOrgRefreshToken =
		 * "5Aep861QbHyftz0nI9EQCBdPQPngCvXhaRLMS0LDkW6CXxT1b4DGgH1zBzCBMT7NIFYd66b0j37V45xD_dPRPNx"
		 * ;
		 * 
		 * 
		 * String status = "open";
		 * 
		 * String pkgId = "a0636000001JkMWAA0"; submitForApproval(bOrgId,
		 * bOrgToken, bOrgURL, bOrgRefreshToken, sOrgId, sOrgToken, sOrgURL,
		 * sOrgRefreshToken, status, pkgId, metadataLogId);
		 * 
		 * /* getPackages(bOrgId, bOrgToken, bOrgURL, refreshToken,
		 * releaseParentId, releaseParentName, releaseStatus, metadataLogId);
		 * getPackages(bOrgId, bOrgToken, bOrgURL, refreshToken,
		 * releaseParentId, releaseParentName, releaseStatus, metadataLogId);
		 */
		// executeScript(Constants.userId, Constants.passwd,
		// Constants.serverURL,"a0161000002rbAS");
		
		String bOrgId = "00D36000000L6NwEAK";
		String bOrgRefreshToken = "5Aep861QbHyftz0nI9EQCBdPQPngCvXhaRLMS0LDkW6CXxT1b5kWANPQdLeOrWA.y_78GQoY2JbfyE1MTVFV0Gk";
		String bOrgToken = "	00D36000000L6Nw!AQgAQDd2ann4dijuGy.8pYIa0zDjUSbdDWPRkYZpy_0XpalISVzsAN0dBuvjsMei0QbAQcBZAuQpHfLptqo.NpFRQrcIOzv6";
		String metadataLogId = "a0536000002zVS8";
		String metadataLogId1 = "a0536000002zBuDAAU";
		String metadataLogId2 = "a0536000002zBuEAAU";
		String validationId="0Af2800000JlHee";

		String bOrgURL = "https://na30.salesforce.com";
		List<MultiPleDeploymentDO> multiPleDeploymentDOs = new ArrayList<MultiPleDeploymentDO>();
		MultiPleDeploymentDO multiPleDeploymentDO = new MultiPleDeploymentDO(
				metadataLogId, bOrgId, bOrgToken, bOrgRefreshToken, bOrgURL,validationId);
	     MultiPleDeploymentDO multiPleDeploymentDO1 = new MultiPleDeploymentDO(
				metadataLogId1, bOrgId, bOrgToken, bOrgRefreshToken, bOrgURL);
		MultiPleDeploymentDO multiPleDeploymentDO2 = new MultiPleDeploymentDO(
				metadataLogId2, bOrgId, bOrgToken, bOrgRefreshToken, bOrgURL);
		multiPleDeploymentDOs.add(multiPleDeploymentDO);
		//multiPleDeploymentDOs.add(multiPleDeploymentDO1);
		//multiPleDeploymentDOs.add(multiPleDeploymentDO2);

		// System.out.println(multiPleDeploymentDOs.toString());

		deployRecentValidation(bOrgId, bOrgToken, bOrgURL, bOrgRefreshToken, "",
				multiPleDeploymentDOs, false,validationId);

	}

	public static void main(String[] args) {
		ForceDepService sr = new ForceDepService();
	}

	public void deploy(String bOrgId, String bOrgToken, String bOrgURL,
			String refreshtoken, String metadataLogId, List<MultiPleDeploymentDO> multiPleDeploymentDOs ,boolean isValidate) {
		Runnable task;
		try {
			System.out.println("Deploy Prococess Initiated with: ");
			System.out.println("bOrgId : " + bOrgId + "~" + "bOrgURL : "
					+ bOrgURL + "~" + "bOrgToken : " + bOrgToken + "~");
			System.out.println("metadata Log Id: " + metadataLogId);
			
			task = new DeployTask(bOrgId, bOrgToken, bOrgURL, refreshtoken,
					metadataLogId, multiPleDeploymentDOs,isValidate);
			
			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Deploy operation Initiated for requestId: "
					+ metadataLogId);
		}
	}

	public void deployRecentValidation(String bOrgId, String bOrgToken, String bOrgURL,
			String refreshtoken, String metadataLogId, List<MultiPleDeploymentDO> multiPleDeploymentDOs ,boolean isValidate,String recentValidationId) {
		Runnable task;
		try {
			System.out.println("Quick Deploy Prococess Initiated with: ");
			System.out.println("bOrgId : " + bOrgId + "~" + "bOrgURL : "
					+ bOrgURL + "~" + "bOrgToken : " + bOrgToken + "~");
			System.out.println("metadata Log Id: " + metadataLogId);
			
			task = new QuickDeployTask(bOrgId, bOrgToken, bOrgURL, refreshtoken,
					metadataLogId, multiPleDeploymentDOs,isValidate,recentValidationId);
			
			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Deploy operation Initiated for requestId: "
					+ metadataLogId);
		}
	}

	public boolean retrieve(String bOrgId, String bOrgToken, String bOrgURL,
			String bOrgRefreshToken, String metadataLogId) {
		Runnable task;
		try {
			task = new RetrieveTask(bOrgId, bOrgToken, bOrgURL,
					bOrgRefreshToken, metadataLogId);
			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Retrieve operation Initiated for requestId: "
					+ metadataLogId);
		}
		return true;
	}

	public boolean updatePackages(String bOrgId, String bOrgToken,
			String bOrgURL, String bOrgRefreshToken, String metadataLogId,
			String status, String packageParentId) {
		Runnable task;
		try {
			task = new UpdatePackagesTask(bOrgId, bOrgToken, bOrgURL,
					bOrgRefreshToken, status, packageParentId, metadataLogId);
			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Retrieve operation Initiated for requestId: "
					+ metadataLogId);
		}
		return true;
	}

	public boolean submitForApproval(String bOrgId, String bOrgToken,
			String bOrgURL, String bOrgRefreshToken, String sOrgId,
			String sOrgToken, String sOrgURL, String sOrgRefreshToken,
			String status, String pkgId, String metadataLogId) {

		Runnable task;
		try {
			task = new SubmitForApprovalTask(bOrgId, bOrgToken, bOrgURL,
					bOrgRefreshToken, sOrgId, sOrgToken, sOrgURL,
					sOrgRefreshToken, status, pkgId, metadataLogId);

			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out
					.println("Submit for Approval operation Initiated for requestId: "
							+ metadataLogId);
		}
		return true;
	}

	public boolean retrieveClient(String bOrgId, String bOrgToken,
			String bOrgURL, String bOrgRefreshToken, String metadataLogId) {
		Runnable task;
		try {
			task = new RetrieveClientTask(bOrgId, bOrgToken, bOrgURL,
					bOrgRefreshToken, Constants.CustomBaseOrgID, metadataLogId);
			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Retrieve operation Initiated for requestId: "
					+ metadataLogId);
		}
		return true;
	}

	public boolean executeScript(String userId, String passwd,
			String serverURL, String metadataLogId, String testcasename) {
		Runnable task;
		try {
			task = new ExecuteScript(userId, passwd, serverURL, metadataLogId,
					testcasename);
			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out
					.println("ExecuteScript  operation Initiated for requestId: "
							+ metadataLogId);
		}
		return true;
	}

	public boolean release(String bOrgId, String bOrgToken, String bOrgURL,
			String bOrgRefreshToken, String releaseParentId,
			String releaseParentName, String releaseStatus, String metadataLogId) {
		Runnable task;
		try {
			task = new ReleaseTask(bOrgId, bOrgToken, bOrgURL,
					bOrgRefreshToken, releaseParentId, releaseParentName,
					releaseStatus, metadataLogId);
			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Release operation Initiated for requestId: "
					+ releaseParentId);
		}
		return true;
	}

	public boolean getPackages(String bOrgId, String bOrgToken, String bOrgURL,
			String bOrgRefreshToken, String releaseParentId,
			String releaseParentName, String releaseStatus, String metadataLogId) {
		Runnable task;
		try {
			task = new GetPackagesTask(bOrgId, bOrgToken, bOrgURL,
					bOrgRefreshToken, releaseParentId, releaseParentName,
					releaseStatus, metadataLogId);
			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Package operation Initiated for requestId: "
					+ releaseParentId);
		}
		return true;
	}

	public boolean getPackageInformation(String bOrgId, String bOrgToken,
			String bOrgURL, String bOrgRefreshToken, String releaseParentId,
			String releaseParentName, String releaseStatus, String metadataLogId) {
		Runnable task;
		try {
			task = new ReleaseTask(bOrgId, bOrgToken, bOrgURL,
					bOrgRefreshToken, releaseParentId, releaseParentName,
					releaseStatus, metadataLogId);
			Thread t = new Thread(task);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Release operation Initiated for requestId: "
					+ releaseParentId);
		}
		return true;
	}
}