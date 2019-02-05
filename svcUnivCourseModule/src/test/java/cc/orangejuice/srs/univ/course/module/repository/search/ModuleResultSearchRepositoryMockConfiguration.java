package cc.orangejuice.srs.univ.course.module.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of ModuleResultSearchRepository to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class ModuleResultSearchRepositoryMockConfiguration {

    @MockBean
    private ModuleResultSearchRepository mockModuleResultSearchRepository;

}
