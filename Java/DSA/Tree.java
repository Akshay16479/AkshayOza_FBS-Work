package ADT;             // tree.

import java.util.Scanner;

class TreeNode {
	int data;
	TreeNode left, right;

	TreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	void setData(int data) {
		this.data = data;
	}

	void setLeft(TreeNode left) {
		this.left = left;
	}

	void setRight(TreeNode right) {
		this.right = right;
	}

	int getData() {
		return data;
	}

	TreeNode getLeft() {
		return left;
	}

	TreeNode getRight() {
		return right;
	}
}

class BinarySearchTree {
	TreeNode root;

	BinarySearchTree() {
		root = null;
	}

	void insertData(int data) {
		root = insert(root, data);
	}

	 TreeNode insert(TreeNode temp, int data) {
		if (temp == null)
			return new TreeNode(data);

		if (data < temp.getData())
			temp.setLeft(insert(temp.getLeft(), data));
		else
			temp.setRight(insert(temp.getRight(), data));

		return temp;
	}

	void display(int choice) {
		switch (choice) {
		case 1:
			inorder(root);
			break;
		case 2:
			preorder(root);
			break;
		case 3:
			postorder(root);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

	 void inorder(TreeNode temp) {
		if (temp != null) {
			inorder(temp.getLeft());
			System.out.println(temp.getData());
			inorder(temp.getRight());
		}
	}

	 void preorder(TreeNode temp) {
		if (temp != null) {
			System.out.println(temp.getData());
			preorder(temp.getLeft());
			preorder(temp.getRight());
		}
	}

	 void postorder(TreeNode temp) {
		if (temp != null) {
			postorder(temp.getLeft());
			postorder(temp.getRight());
			System.out.println(temp.getData());
		}
	}

	void deleteData(int data) {
		root = delete(root, data);
	}

	 TreeNode delete(TreeNode temp, int data) {
		if (temp == null)
			return null;

		if (data < temp.getData()) {
			temp.setLeft(delete(temp.getLeft(), data));
		} else if (data > temp.getData()) {
			temp.setRight(delete(temp.getRight(), data));
		} else {
			if (temp.getLeft() == null && temp.getRight() == null)
				return null;
			if (temp.getLeft() == null)
				return temp.getRight();
			if (temp.getRight() == null)
				return temp.getLeft();

			TreeNode least = temp.getRight();
			while (least.getLeft() != null) {
				least = least.getLeft();
			}
			temp.setData(least.getData());
			temp.setRight(delete(temp.getRight(), least.getData()));
		}
		return temp;
	}
}

class TreeMenu {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		int choice = 1;

		while (choice != 0) {
			System.out.println("\nMenu:");
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Delete");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value: ");
				bst.insertData(sc.nextInt());
				break;

			case 2:
				System.out.println("1.Inorder  2.Preorder  3.Postorder");
				bst.display(sc.nextInt());
				break;

			case 3:
				System.out.print("Enter value to delete: ");
				bst.deleteData(sc.nextInt());
				break;

			case 0:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Invalid"); 
			}
		}
		sc.close();
	}
}


