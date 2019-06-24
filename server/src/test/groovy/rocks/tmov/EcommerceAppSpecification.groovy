package rocks.tmov

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import rocks.tmov.EcommerceApp
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = EcommerceApp)
class EcommerceAppSpecification extends Specification {

	@Autowired
	TestRestTemplate restTemplate

	def "The apps starts up and health is good!"() {
		when:
		def healthResponse = restTemplate.getForEntity("/actuator/health", Object.class)

		then:
		healthResponse.statusCode == HttpStatus.OK
	}
}
