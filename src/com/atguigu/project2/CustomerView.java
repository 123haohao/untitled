package com.atguigu.project2;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);
    public CustomerView(){
        //用到Customer全参构造器
        Customer customer = new Customer("浩浩",18,'男',"13122454","192347@qq.com");
        customerList.addCustomer(customer);
    }
    //进入菜单
    public void enterMainMenu(){
        boolean isFlag = true;
        while(isFlag) {
            System.out.println("---------------客户信息管理软件---------------\n");
            System.out.println("                 1 添加客户                    ");
            System.out.println("                 2 修改客户                    ");
            System.out.println("                 3 删除客户                    ");
            System.out.println("                 4 客户列表                    ");
            System.out.println("                 5 退   出                    \n");
            System.out.println("请选择(1-5)：");

            char menu = CMUtility.readMenuSelection();
            switch(menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deldteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("是否确认退出(Y/N)：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }

            }
        }
    }
    //添加客户
    public void addNewCustomer(){
        System.out.println("------------------添加客户--------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(15);
        Customer customer = new Customer(name,age,gender,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("----------------添加成功-------------------");
        }else {
            System.out.println("----------客户目录已满，添加失败！-----------");
        }


    }
    //修改客户
    public void modifyCustomer(){
        System.out.println("-----------------修改客户-----------------");
        Customer cust;
        int number;
        for (;;){
            System.out.println("请选择待修改客户的编号(-1退出)：");
            number = CMUtility.readInt();
            if (number == -1){
               return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null){
                System.out.println("无法找到指定客户！");
            }else{
                break;
            }
        }
        System.out.print("姓名(" + cust.getName() + "):");
        String name =   CMUtility.readString(10,cust.getName());
        System.out.println("性别(" + cust.getGender() + "):");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.println("年龄(" + cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.println("电话号码(" + cust.getPhone() + "):");
        String phone = CMUtility.readString(11,cust.getPhone());
        System.out.println("邮箱(" + cust.getEmail() + "):");
        String email = CMUtility.readString(15,cust.getEmail());

        Customer newCust = new Customer(name,age,gender,phone,email);
        boolean isReplace = customerList.replaceCustomer(number - 1,newCust);
        if (isReplace){
            System.out.println("-------------------修改成功-------------------");
        }else{
            System.out.println("-------------------修改失败-------------------");
        }
    }
    //删除客户
    public void deldteCustomer(){
        System.out.println("--------------------删除客户----------------------");
        Customer cust;
        int number;
        for(;;){
            System.out.println("请选择待删除的客户编号(-1退出)：");
            number = CMUtility.readInt();
            if (number == -1){
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null){
                System.out.println("无法找到指定客户！");
            }else {
                break;
            }
        }
        System.out.println("确认是否删除(Y/N)：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y'){
            customerList.deleteCustomer(number -1);
            System.out.println("删除成功！");
        }

    }
    //列出所有客户
    private void listAllCustomer(){
        System.out.println("------------------客户列表--------------------\n");
        int total = customerList.getTotal();
        if (total <= 0){
            System.out.println("没有客户记录！");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] custs = customerList.getAllCustomer();
            for (int i = 0;i < custs.length;i++){
                Customer customer = custs[i];
                System.out.println((i + 1) + "\t\t" + customer.getName() + "\t" + customer.getGender()
                + "\t\t" + customer.getAge() + "\t\t" + customer.getPhone() + "\t\t" + customer.getEmail());
            }

        }
        System.out.println();
    }
    public static void main(String[] args){
    CustomerView view = new CustomerView();
    view.enterMainMenu();
    }
}
