import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggingConfig {

    @Bean
    public Logger claimControllerLogger() {
        return LoggerFactory.getLogger(ClaimController.class);
    }

    @Bean
    public Logger customerControllerLogger() {
        return LoggerFactory.getLogger(CustomerController.class);
    }

    @Bean
    public Logger diseaseControllerLogger() {
        return LoggerFactory.getLogger(DiseaseController.class);
    }

    @Bean
    public Logger emailControllerLogger() {
        return LoggerFactory.getLogger(EmailController.class);
    }

    @Bean
    public Logger fileControllerLogger() {
        return LoggerFactory.getLogger(FileController.class);
    }

    @Bean
    public Logger insurancePackageControllerLogger() {
        return LoggerFactory.getLogger(InsurancePackageController.class);
    }

    @Bean
    public Logger insuranceScheduleControllerLogger() {
        return LoggerFactory.getLogger(InsuranceScheduleController.class);
    }

    @Bean
    public Logger loginControllerLogger() {
        return LoggerFactory.getLogger(LoginController.class);
    }

    @Bean
    public Logger networkHospitalControllerLogger() {
        return LoggerFactory.getLogger(NetworkHospitalController.class);
    }

    @Bean
    public Logger packagesControllerLogger() {
        return LoggerFactory.getLogger(PackagesController.class);
    }

    @Bean
    public Logger paymentControllerLogger() {
        return LoggerFactory.getLogger(PaymentController.class);
    }

    @Bean
    public Logger settlementControllerLogger() {
        return LoggerFactory.getLogger(SettlementController.class);
    }
}
