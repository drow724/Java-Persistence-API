package jpabook.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpabook.model.entity.Child;
import jpabook.model.entity.Parent;
import jpabook.model.entity.ParentId;

/**
 * Created by 1001218 on 15. 4. 5..
 */
public class Main {

	public static void main(String[] args) {

        //엔티티 매니저 팩토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager(); //엔티티 매니저 생성

        EntityTransaction tx = em.getTransaction(); //트랜잭션 기능 획득

        try {

            tx.begin(); //트랜잭션 시작
//            Parent parent = new Parent();
//            parent.setId1("myId1");
//            parent.setId2("myId2");
//            parent.setName("parentName");
//            em.persist(parent);
//
//            ParentId parentId = new ParentId("myId1","myId2");
//            Parent findParent = em.find(Parent.class, parentId);
//            System.out.println("parent is " + findParent.getName());
//            
//            Child child = new Child();
//            child.setId("yourId");
//            Parent parent2 = new Parent();
//            parent2.setId1("yourId1");
//            parent2.setId2("yourId2");
//            parent2.setName("parentName2");
//            child.setParent(parent);
//            em.persist(child);
            
//	          Parent parent = new Parent();
//	          ParentId parentId = new ParentId("myId1","myId2");
//	          parent.setId(parentId);
//	          parent.setName("parentName");
//	          em.persist(parent);
//	            
//	          Parent findParent = em.find(Parent.class, parentId);
//	          System.out.println("parent is " + findParent.getName());
	          
	          ParentId parentId1 = new ParentId("myId1","myId2");
	          ParentId parentId2 = new ParentId("myId1","myId2");
	          
	          System.out.println(parentId1.equals(parentId2));
            //TODO 비즈니스 로직
            tx.commit();//트랜잭션 커밋

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback(); //트랜잭션 롤백
        } finally {
            em.close(); //엔티티 매니저 종료
        }

        emf.close(); //엔티티 매니저 팩토리 종료
    }

}
