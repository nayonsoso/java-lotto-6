package model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RankStatisticsTest {
    @DisplayName("순위 통계에 아무것도 추가하지 않으면 통계의 숫자는 0이다.")
    @Test
    void remainStatisticsNumberZeroWithoutAddingRank(){
        RankStatistics rankStatistics = new RankStatistics();
        int firstCountBefore = rankStatistics.getRankStatistics().get(LottoRank.FIRST);
        rankStatistics.add(LottoRank.FIRST);
        int firstCountAfter = rankStatistics.getRankStatistics().get(LottoRank.FIRST);
        assertThat(firstCountBefore).isEqualTo(0);
        assertThat(firstCountBefore).isEqualTo(1);
    }
}