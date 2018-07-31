package north.web.demo.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author: murasakiseifu
 * @date: 2018/7/30 下午4:48}
 * @version: V1.0
 * @review: murasakiseifu/2018/7/30 下午4:48}
 */
@EnableScheduling //开启定时器
@ServletComponentScan //注解 @EnableTransactionManagement 开启事务支持后，然后在访问数据库的Service方法上添加注解 @Transactional 便可。
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ManagerBootApplication {

    //使用指定类初始化日志对象,在日志输出的时候,可以打印出日志信息所在类
    private static final Logger LOGGER = LoggerFactory.getLogger(ManagerBootApplication.class);

    public static void main(String[] args) {
        //初始化启动类
        SpringApplication app = new SpringApplication(ManagerBootApplication.class);
        //启动
        ConfigurableApplicationContext context = app.run(args);

        LOGGER.info(print());
        LOGGER.info("ManagerBootApplication is successing!");
    }

    private static String print(){
        StringBuilder sb = new StringBuilder();
        sb.append("                          \n");
        sb.append("                    .--- . \n");
        sb.append("                 _.'__    `.\n");
        sb.append("             .--(#)(##)---/#\\\n");
        sb.append("           .' @          /###\\\n");
        sb.append("           :         ,   #####\n");
        sb.append("            `-..__.-' _.-\\###/\n");
        sb.append("                  `;_:    `\"'\n");
        sb.append("                .'\"\"\"\"\"`.\n");
        sb.append("               /,       ,\\\n");
        sb.append("              //         \\\\\n");
        sb.append("              `-._______.-'\n");
        sb.append("              ___`. | .'___\n");
        sb.append("             (______|______)\n");
        return sb.toString();
    }
}
