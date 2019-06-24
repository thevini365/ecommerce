package rocks.tmov

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest(classes = EcommerceApp)
class EcommerceAppContextSpecification extends Specification {

	@Autowired
	ApplicationContext context

	def "ApplicationContext is loaded"() {
		expect:
		context != null
	}
}
