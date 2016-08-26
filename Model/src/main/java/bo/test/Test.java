package bo.test;

import java.util.Date;
import java.util.List;

import bo.entities.ReconcilliationMaster;
import bo.services.ReconcilliationService;

public class Test {

	public static void main(String[] args) {
		ReconcilliationService svc = new ReconcilliationService();
//		List<ReconcilliationMaster> masters = svc.findAll();
//		for (ReconcilliationMaster master : masters) {
//			System.out.println(master.getReconcileNo());
//		}
		
		//System.out.println(svc.findByReconNo("REC-001").getReconcileNo());
		
//		svc.insert("REC-003", new Date(), 16, 1000000000000.0, 100000000000.0, 900000000000.0, "adjie");
//		svc.update("REC-003", 1000000000000.0, 200000000000.0, 800000000000.0);
		//svc.delete("REC-003");
		
		System.out.println("Done!");
	}
}
