package fr.espritgospel.server.web.mapper;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AddressMapperTest.class, ConcertMapperTest.class, UserMapperTest.class})
public class MapperSuiteTest {}
