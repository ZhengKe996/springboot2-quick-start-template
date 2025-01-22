package fun.timu.init.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SQL 工具
 *
 * @author zhengke
 * @date 2024年12月31日
 */
@Slf4j
public class SqlUtils {
    private static final Logger logger = LoggerFactory.getLogger(SqlUtils.class);
    private static final String INVALID_CHARACTERS_REGEX = "[=\\(\\) '\";]";

    /**
     * 校验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if (StringUtils.isBlank(sortField)) {
            logger.debug("排序字段为空或空白");
            return false;
        }

        if (sortField.matches(".*" + INVALID_CHARACTERS_REGEX + ".*")) {
            logger.warn("排序字段包含非法字符: {}", sortField);
            return false;
        }

        logger.debug("排序字段 {} 合法", sortField);
        return true;
    }
}
