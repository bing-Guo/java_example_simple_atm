package practice_2018_0418;

/*
 * 1. �����ۤv�s�W�@�ӽs����"ABC-123"���b��
 * 2. �s�� 2000��
 * 3. �I�s�ۤv�� balance �ܼơA�ݬݷ|�o�ͤ���Ʊ��H
 * 4. �I�s getBalance() ��k�A�ݬݷ|�o�ͤ���Ʊ��H
 * 5. ����   500��
 * 6. �I�s toSting() ��k�A�ݬݷ|�o�ͤ���Ʊ��H
 * ----------------------------------------------
 * 7. �� Liam �إߤ@�ӽs����"RRR-777"�A�ö}��P�����L�s5000���i�b��
 * 8. �� Laim �I�s toSting() ��k�A�ݬݷ|�o�ͤ���Ʊ��H
 * ----------------------------------------------
 * 9. �p�G�H�W���S���D�A�g�@��transfer����k�i����b�A�ѼƬ�account user, amount
 * 10. �� Laim ��b���ۤv1000��
 * 11. �I�s toSting() ��k�A�ݬݦ��S����b���\
 * */
public class main {
	public static void main(String[] args) {
		account me = new account("Bing", "ABC-123");
		
		me.deposit(2000);
//		System.out.println(me.balance); // private ���ઽ���I�s
		System.out.println(me.getBalance());
		
		me.withdraw(500);
		System.out.println(me.toString());
		
		account laim = new account("Liam", "RRR-777", 5000);
		System.out.println(laim.toString());
		
		laim.transfer(me, 200);
		System.out.println(me.toString());
		System.out.println(laim.toString());
	}
}
