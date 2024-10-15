package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void first2_equals_test() {
        Team team = new Team("test-team");
        assertEquals(team.equals(team), true);
        assertEquals(team.equals("wrong"), false);
    }

    @Test
    public void true_true_equals_test() {
        Team t1 = new Team("correct");
        Team t2 = new Team("correct");
        t1.addMember("correct");
        t2.addMember("correct");
        assertEquals(t1.equals(t2), true);
    }

    @Test
    public void true_false_equals_test() {
        Team t1 = new Team("correct");
        Team t2 = new Team("correct");
        t1.addMember("correct");
        t2.addMember("wrong");
        assertEquals(t1.equals(t2), false);
    }

    @Test
    public void false_true_equals_test() {
        Team t1 = new Team("correct");
        Team t2 = new Team("wrong");
        t1.addMember("correct");
        t2.addMember("correct");
        assertEquals(t1.equals(t2), false);
    }

    @Test
    public void false_false_equals_test() {
        Team t1 = new Team("correct");
        Team t2 = new Team("wrong");
        t1.addMember("correct");
        t2.addMember("wrong");
        assertEquals(t1.equals(t2), false);
    }

    @Test
    public void hash_code_test() {
        Team t1 = new Team("jun");
        t1.addMember("yoon");
        Team t2 = new Team("jun");
        t2.addMember("yoon");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hash_code_test_2() {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
