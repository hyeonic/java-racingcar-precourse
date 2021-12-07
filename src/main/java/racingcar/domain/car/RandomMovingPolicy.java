package racingcar.domain.car;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMovingPolicy implements MovingPolicy {
    private static final int MIN_NUMBER_RANGE = 0;
    private static final int MAX_NUMBER_RANGE = 9;
    private static final int MOVE_CONDITION = 4;

    @Override
    public boolean isMoving() {
        if (getRandomNumber() >= MOVE_CONDITION) {
            return true;
        }
        return false;
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER_RANGE, MAX_NUMBER_RANGE);
    }
}