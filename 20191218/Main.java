import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        while (true) {
            // 1. 打印操作界面
            menu();
            // 2. 用户输入选择
            int selected = scanner.nextInt();
            scanner.nextLine();
            // 3. 根据用户的选择，执行不同的动作
            switch (selected) {
                case 1:
                    add(contact, scanner);
                    System.out.println("DEBUG: " + contact);
                    break;
                case 2:
                    search(contact, scanner);
                    break;
                case 3:
                    remove(contact, scanner);
                    System.out.println("DEBUG: " + contact);
                    break;
                case 4:
                    update(contact, scanner);
                    System.out.println("DEBUG: " + contact);
                    break;
                default:
                    System.out.println("指令错误");
            }
        }
    }

    private static void update(Contact contact, Scanner scanner) {
        System.out.println("请输入要更新的姓名: ");
        String name = scanner.nextLine();
        System.out.println("请选择要更新的字段: ");
        System.out.println("1. 姓名");
        System.out.println("2. 手机号");
        System.out.println("3. 办公室电话");
        int selected = scanner.nextInt();
        scanner.nextLine();
        switch (selected) {
            case 1: {
                System.out.println("请输入新的姓名:");
                String newName = scanner.nextLine();
                User user = contact.get(name);
                if (user == null) {
                    System.out.println("查无此人");
                } else {
                    try {
                        contact.add(newName, user.mobilePhone, user.officePhone);
                        try {
                            contact.remove(name);
                        } catch (NameNotFoundException e) {
                        }
                    } catch (NameExistException e) {
                        System.out.println("新姓名已经存在");
                    }
                }
                break;
            }
            case 2: {
                System.out.println("请输入新的手机号:");
                String mobilePhone = scanner.nextLine();
                User user = contact.get(name);
                if (user == null) {
                    System.out.println("查无此人");
                } else {
                    // 通过引用修改，map 中保存的值也会变化
                    user.mobilePhone = mobilePhone;
                    System.out.println("修改成功");
                }
                break;
            }
            case 3: {
                System.out.println("请输入新的办公室电话:");
                String officePhone = scanner.nextLine();
                User user = contact.get(name);
                if (user == null) {
                    System.out.println("查无此人");
                } else {
                    // 通过引用修改，map 中保存的值也会变化
                    user.officePhone = officePhone;
                    System.out.println("修改成功");
                }
                break;
            }
        }
    }

    private static void remove(Contact contact, Scanner scanner) {
        System.out.println("请输入姓名:");
        String name = scanner.nextLine();
        try {
            contact.remove(name);
            System.out.println("成功删除");
        } catch (NameNotFoundException e) {
            System.out.println("查无此人");
        }
    }

    private static void search(Contact contact, Scanner scanner) {
        System.out.println("请输入姓名:");
        String name = scanner.nextLine();
        User user = contact.get(name);
        if (user == null) {
            System.out.println("查无此人");
        } else {
            System.out.println("手机号: " + user.mobilePhone);
            System.out.println("办公室电话: " + user.officePhone);
        }
    }

    private static void add(Contact contact, Scanner scanner) {
        System.out.println("请输入姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入手机:");
        String mobilePhone = scanner.nextLine();
        System.out.println("请输入办公室电话:");
        String officePhone = scanner.nextLine();

        try {
            contact.add(name, mobilePhone, officePhone);
            System.out.println("添加成功");
        } catch (NameExistException e) {
            System.out.println("添加失败，用户已经存在");
        } finally {
            System.out.println("**********************");
        }
    }

    private static void menu() {
        System.out.println("| 比特专用通讯录");
        System.out.println("| 1. 添加");
        System.out.println("| 2. 查找");
        System.out.println("| 3. 删除");
        System.out.println("| 4. 更新");
        System.out.println("请选择正确的选项:");
    }
}
